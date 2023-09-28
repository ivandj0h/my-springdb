package com.ivandjoh.myspringdb.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String description,
        Status status,
        Type contentType,
        String url,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
