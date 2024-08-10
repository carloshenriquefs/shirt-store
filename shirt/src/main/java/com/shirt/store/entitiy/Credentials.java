package com.shirt.store.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tb_credentials")
public class Credentials implements Serializable {
    private static final long serialVersionUID = 1L;

    @MongoId
    private UUID id;
    private String email;
    private String password;
}
