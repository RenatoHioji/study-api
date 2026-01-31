package com.example.api.domain;

import java.time.LocalDateTime;

public abstract class BaseEntity {
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
}
