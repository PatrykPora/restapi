package pl.patrykpora.restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.patrykpora.restapi.model.Post;
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

    public Post savePost(Post post) {
        return postRepo.save(post);
    }
}
