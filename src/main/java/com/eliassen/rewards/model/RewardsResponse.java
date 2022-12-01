package com.eliassen.rewards.model;

import lombok.Data;

@Data
public class RewardsResponse {
    private Transaction transaction;
    private Long pointsAwarded;
}
