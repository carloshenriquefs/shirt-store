package com.shirt.store.entitiy;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Document(collection = "tb_coupons")
public class CouponDiscount {

    @MongoId
    private UUID id;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal discount;

    private String codeCoupon;
}
