package com.shirt.store.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tb_purchases")
public class PurchaseHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    @MongoId
    private UUID id;
    private UUID itemId;
    private UUID userId;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal discount;
    private List<Coupon> couponList;

    private Schedule schedule;

}
