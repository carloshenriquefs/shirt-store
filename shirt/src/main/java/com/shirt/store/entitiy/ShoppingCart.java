package com.shirt.store.entitiy;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Document(collection = "tb_shoppings")
public class ShoppingCart {

    @MongoId
    private UUID id;
    private UUID userId;
    private List<ItemCart> items;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}
