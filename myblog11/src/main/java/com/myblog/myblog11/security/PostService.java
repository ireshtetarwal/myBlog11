package com.myblog.myblog11.security;

import com.myblog.myblog11.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
