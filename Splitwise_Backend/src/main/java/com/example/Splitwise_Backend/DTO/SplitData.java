package com.example.Splitwise_Backend.DTO;

public class SplitData {
    private int userId;
    private int amount;

    public SplitData(int userId, int amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "splitData{" +
                "userId=" + userId +
                ", amount=" + amount +
                '}';
    }
}
