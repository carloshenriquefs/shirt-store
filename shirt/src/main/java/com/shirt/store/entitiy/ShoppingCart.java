package com.shirt.store.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.util.List;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tb_shoppings")
public class ShoppingCart implements Serializable {
    private static final long serialVersionUID = 1L;

    @MongoId
    private UUID id;
    private UUID userId;
    private List<ItemCart> items;
    private Schedule schedule;
}
