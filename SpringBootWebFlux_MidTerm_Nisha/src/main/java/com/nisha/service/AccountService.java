package com.nisha.service;

import com.nisha.model.Checking;
import com.nisha.model.Savings;
import com.nisha.repository.CheckingRepository;
import com.nisha.repository.SavingsRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountService {

    private final CheckingRepository checkingRepo;
    private final SavingsRepository savingsRepo;

    public AccountService(CheckingRepository checkingRepo, SavingsRepository savingsRepo) {
        this.checkingRepo = checkingRepo;
        this.savingsRepo = savingsRepo;
    }

    public Mono<Checking> createChecking(Checking checking) {
        return checkingRepo.save(checking);
    }

    public Flux<Checking> getAllChecking() {
        return checkingRepo.findAll();
    }

    public Mono<Savings> createSavings(Savings savings) {
        return savingsRepo.save(savings);
    }

    public Flux<Savings> getAllSavings() {
        return savingsRepo.findAll();
    }
}
