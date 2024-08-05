package com.shirt.store.repository;

import com.shirt.store.entitiy.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<User, UUID> {
}
