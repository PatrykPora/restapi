package pl.patrykpora.restapi.dto;


import org.hibernate.validator.constraints.Length;

public record PostDtoToSave(
        @Length(min = 5) String title, @Length(min = 10) String content ) {}
