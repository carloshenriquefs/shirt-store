package com.shirt.store.repository;

import com.shirt.store.entitiy.CouponDiscount;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CouponDiscountRepository extends MongoRepository<CouponDiscount, UUID> {
}
