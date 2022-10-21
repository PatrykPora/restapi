package pl.patrykpora.restapi.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import pl.patrykpora.restapi.model.Post;
import pl.patrykpora.restapi.model.PostDto;
import pl.patrykpora.restapi.service.PostService;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @GetMapping("/post")
    public List<Post> getPosts() {
        return postService.getAllPost();
    }

    @GetMapping("/post/{id}")
    public Post getPost(@PathVariable Integer id){
        return postService.getPostById(id);
    }


    @PostMapping("/post")
    public ResponseEntity<Object> createPost(@RequestBody PostDto postDto){
        Post postToAdd = new Post();
        postToAdd.setContent(postDto.getContent());
        postToAdd.setTitle(postDto.getTitle());
        postToAdd.setCreated(postDto.getCreated());

        UriComponents uriComponents = UriComponentsBuilder
                .fromHttpUrl("http://localhost:8080/post/{id}")
                .buildAndExpand(postToAdd.getId());
        return ResponseEntity.created(uriComponents.toUri())
                .build();

    }
}
