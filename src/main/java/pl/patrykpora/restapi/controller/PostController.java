package pl.patrykpora.restapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykpora.restapi.model.Post;

import java.util.List;

@RestController
public class PostController {


    @GetMapping("/post")
    public List<Post> getPosts() {
        throw new NullPointerException("there is nothing to show here yet");
    }

    @GetMapping("/post/{id}")
    public Post getPost(@PathVariable int id){
        throw new NullPointerException("foo");
    }

}
