package com.shirt.store.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScheduleDTO {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime createdAt = LocalDateTime.now();
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime updatedAt = LocalDateTime.now();
}
