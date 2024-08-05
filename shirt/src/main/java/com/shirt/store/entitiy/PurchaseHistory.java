package com.shirt.store.entitiy;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Document(collection = "tb_purchases")
public class PurchaseHistory {

    @MongoId
    private UUID id;
    private UUID itemId;
    private UUID userId;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal discount;
    private List<Coupon> couponList;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

}
