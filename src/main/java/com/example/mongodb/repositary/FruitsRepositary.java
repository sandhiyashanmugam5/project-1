package com.example.mongodb.repositary;

import com.example.mongodb.model.Fruits;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitsRepositary extends MongoRepository<Fruits,String> {
}
