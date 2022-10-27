package pl.patrykpora.restapi.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import pl.patrykpora.restapi.dto.PostDtoToSave;
import pl.patrykpora.restapi.dto.PostDtoWithComments;
import pl.patrykpora.restapi.model.Post;
import pl.patrykpora.restapi.dto.PostDto;
import pl.patrykpora.restapi.service.PostService;
import javax.validation.Valid;
import java.util.List;

import static pl.patrykpora.restapi.mapper.PostMapper.*;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @GetMapping("/post")
    public List<PostDto> getPosts() {
        return mapPostsToPostDtoList(postService.getAllPost());
    }



    @GetMapping("/post/{id}")
    public PostDtoWithComments getPost(@PathVariable Integer id) {
       Post post = postService.getPostById(id);
       return mapToPostDtoWithComments(post);
    }



    @PostMapping("/post")
    public ResponseEntity<Object> createPost(@RequestBody @Valid PostDtoToSave postDtoToSave) {
        Post postToAdd = mapPostDtoToSaveToPost(postDtoToSave);
        postService.savePost(postToAdd);
        UriComponents uriComponents = UriComponentsBuilder
                .fromHttpUrl("http://localhost:8080/post/{id}")
                .buildAndExpand(postToAdd.getId());
        return ResponseEntity.created(uriComponents.toUri())
                .build();
    }

}
