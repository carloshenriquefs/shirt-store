package com.shirt.store.repository;

import com.shirt.store.entitiy.PurchaseHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface PurchaseHistoryRepository extends MongoRepository<PurchaseHistory, UUID> {
}
