package com.example.this_api_is_a_joke.data;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Joke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema( accessMode = Schema.AccessMode.READ_ONLY, description = "Unique translation id")
    private Long id;

    private String content;

    private String type;

    public Joke(String content, String type) {
        this.content = content;
        this.type = type;
    }
}
