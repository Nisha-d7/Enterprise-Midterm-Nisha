package com.nisha.repository;

import com.nisha.model.Savings;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsRepository extends ReactiveMongoRepository<Savings, String> {}
