package com.example.api.shared;

import java.time.LocalDateTime;

public abstract class BaseEntity {
    protected LocalDateTime createdAt = LocalDateTime.now();
    protected LocalDateTime updatedAt;
}
