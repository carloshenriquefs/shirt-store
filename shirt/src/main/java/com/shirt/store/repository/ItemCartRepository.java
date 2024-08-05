package com.shirt.store.repository;

import com.shirt.store.entitiy.ItemCart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ItemCartRepository extends MongoRepository<ItemCart, UUID> {
}
