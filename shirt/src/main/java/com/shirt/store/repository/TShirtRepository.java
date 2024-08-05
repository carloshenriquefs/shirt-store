package com.shirt.store.repository;

import com.shirt.store.entitiy.TShirt;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface TShirtRepository extends MongoRepository<TShirt, UUID> {
}
