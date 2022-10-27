package pl.patrykpora.restapi.mapper;

import pl.patrykpora.restapi.dto.CommentDto;
import pl.patrykpora.restapi.model.Comment;

import java.util.List;
import java.util.stream.Collectors;

public class CommentMapper {

    public static CommentDto mapToCommentDto(Comment comment) {
        return new CommentDto(comment.getContent(), comment.getCreated());
    }

    public static List<CommentDto> mapToCommentDtoList(List<Comment> comments){
        return comments.stream()
                .map(comment -> mapToCommentDto(comment))
                .collect(Collectors.toList());
    }
}
