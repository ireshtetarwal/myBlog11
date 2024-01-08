package com.myblog.myblog11.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // this work both getter and setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long id;

    private String title;
    private String description;
    private String content;
}
