package com.shirt.store.entitiy;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Schedule {

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}
