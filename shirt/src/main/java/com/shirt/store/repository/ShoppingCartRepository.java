package com.shirt.store.repository;

import com.shirt.store.entitiy.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, UUID> {
}
