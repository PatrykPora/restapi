package pl.patrykpora.restapi.mapper;

import pl.patrykpora.restapi.dto.PostDto;
import pl.patrykpora.restapi.dto.PostDtoToSave;
import pl.patrykpora.restapi.model.Post;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class PostMapper {


    public static List<PostDto> mapPostsToPostDtoList(List<Post> allPost) {
        return allPost.stream()
                .map(post -> new PostDto(
                        post.getTitle(),
                        post.getContent(),
                        post.getCreated()))
                .collect(Collectors.toList());
    }

    public static PostDto mapToPostDto(Post post) {
        return new PostDto(post.getTitle(), post.getContent(), post.getCreated());
    }

    public static Post mapPostDtoToSaveToPost(PostDtoToSave postDtoToSave) {
        Post postToAdd = new Post();
        postToAdd.setTitle(postDtoToSave.title());
        postToAdd.setContent(postDtoToSave.content());
        postToAdd.setCreated(LocalDateTime.now());
        return postToAdd;
    }


}
