package com.eliassen.rewards.service;

import com.eliassen.rewards.model.RewardsResponse;
import com.eliassen.rewards.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RewardsService {
    public Long calculatePointsAwarded(Long dollarsSpent) {
        if (dollarsSpent < 50L) {
            return 0L;
        }
        if (dollarsSpent <= 100L) {
            return dollarsSpent - 50L;
        }
        return 50L + (dollarsSpent - 100L) * 2L;
    }

    public List<RewardsResponse> calculateRewardsForImportedTransactions(List<Transaction> transactionList) {
        List<RewardsResponse> rewardsResponseList = new ArrayList<>();

        transactionList.forEach(transaction -> {
            RewardsResponse response = new RewardsResponse();
            response.setTransaction(transaction);
            response.setPointsAwarded(calculatePointsAwarded(transaction.getAmount()));
            rewardsResponseList.add(response);
        });

        return rewardsResponseList;
    }
}
