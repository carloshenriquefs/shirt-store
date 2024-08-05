package com.shirt.store.entitiy;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Document(collection = "tb_tshirts")
public class TShirt {

    @MongoId
    private UUID id;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal price;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal discount;

    private String title;
    private String description;
    private String image;
    private Long stock;
    private TechnicalDescription techDesc;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}
