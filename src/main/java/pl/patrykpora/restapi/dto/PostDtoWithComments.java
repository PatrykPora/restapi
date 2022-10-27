package pl.patrykpora.restapi.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.patrykpora.restapi.model.Comment;

import java.time.LocalDateTime;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostDtoWithComments {

    private String title;
    private String content;
    private LocalDateTime created;
    private List<CommentDto> comments;

}
