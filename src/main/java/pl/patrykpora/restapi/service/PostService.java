package pl.patrykpora.restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.patrykpora.restapi.controller.PostController;
import pl.patrykpora.restapi.model.Post;
import pl.patrykpora.restapi.model.PostDto;
import pl.patrykpora.restapi.repo.PostRepo;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepo postRepo;


    public List<Post> getAllPost(){
        return postRepo.findAll();
    }

    public Post getPostById(Integer id){
        return postRepo.findById(id).get();
    }

    public Post createPost(Post post) {
        return postRepo.save(post);
    }
}
