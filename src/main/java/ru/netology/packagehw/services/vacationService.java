package ru.netology.packagehw.services;

public class vacationService {
    public int calculate(int money, int income, int expense, int count) {
        income = 10000;
        expense = 3000;
        money = 0;
        count = 0;
        int threshold = 20000;
        int month = 1;
        int amount = 0;

        for (month = 1; month < 12; month++) {
            if (amount >= threshold) {
                count++;
                amount = (amount - expense) / 3;
            } else {
                amount = amount + income - expense;
            }
        }
        return count;
    }
}

