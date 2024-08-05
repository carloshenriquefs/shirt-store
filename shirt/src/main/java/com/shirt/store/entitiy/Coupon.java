package com.shirt.store.entitiy;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;

@Data
@Document(collection = "tb_coupons")
public class Coupon {

    @MongoId
    private UUID id;
}
