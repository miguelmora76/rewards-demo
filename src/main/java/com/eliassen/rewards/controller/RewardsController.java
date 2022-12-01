package com.eliassen.rewards.controller;

import com.eliassen.rewards.model.RewardsResponse;
import com.eliassen.rewards.model.Transaction;
import com.eliassen.rewards.service.RewardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rewards")
@RequiredArgsConstructor
public class RewardsController {
    private final RewardsService rewardsService;

    @PostMapping("/points")
    public Long calculatePointsAwarded(@RequestParam("dollarsSpent") Long dollarsSpent) {
        return rewardsService.calculatePointsAwarded(dollarsSpent);
    }

    @PostMapping("/points/report")
    public List<RewardsResponse> importTransactions(@RequestBody List<Transaction> transactionList) {
        return rewardsService.calculateRewardsForImportedTransactions(transactionList);
    }
}
