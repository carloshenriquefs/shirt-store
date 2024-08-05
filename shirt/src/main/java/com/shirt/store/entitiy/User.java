package com.shirt.store.entitiy;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Document(collection = "tb_users")
public class User {

    @MongoId
    private UUID id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String number;
    private String birthday;
    private String phoneNumber;
    private Boolean notifications;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

}
