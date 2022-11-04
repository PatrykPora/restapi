package pl.patrykpora.restapi.mapper;

import pl.patrykpora.restapi.dto.PostDto;
import pl.patrykpora.restapi.dto.PostDtoToSave;
import pl.patrykpora.restapi.dto.PostDtoWithComments;
import pl.patrykpora.restapi.model.Post;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static pl.patrykpora.restapi.mapper.CommentMapper.mapToCommentDtoList;

public class PostMapper {

    private PostMapper(){}

    public static List<PostDto> mapPostsToPostDtoList(List<Post> allPost) {
        return allPost.stream()
                .map(post -> new PostDto(
                        post.getTitle(),
                        post.getContent(),
                        post.getCreated()))
                .collect(Collectors.toList());
    }

    public static PostDtoWithComments mapToPostDtoWithComments(Post post) {
        return new PostDtoWithComments(
                post.getTitle(),
                post.getContent(),
                post.getCreated(),
                mapToCommentDtoList(post.getComments()));
    }

    public static Post mapPostDtoToSaveToPost(PostDtoToSave postDtoToSave) {
        Post postToAdd = new Post();
        postToAdd.setTitle(postDtoToSave.title());
        postToAdd.setContent(postDtoToSave.content());
        postToAdd.setCreated(LocalDateTime.now());
        return postToAdd;
    }



}
