package com.nisha.controller;

import com.nisha.service.AccountService;
import com.nisha.model.Checking;
import com.nisha.model.Savings;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/checking")
    public Mono<Checking> createChecking(@RequestBody Checking checking) {
        return accountService.createChecking(checking);
    }

    @GetMapping("/checking")
    public Flux<Checking> getAllChecking() {
        return accountService.getAllChecking();
    }

    @PostMapping("/savings")
    public Mono<Savings> createSavings(@RequestBody Savings savings) {
        return accountService.createSavings(savings);
    }

    @GetMapping("/savings")
    public Flux<Savings> getAllSavings() {
        return accountService.getAllSavings();
    }
}
