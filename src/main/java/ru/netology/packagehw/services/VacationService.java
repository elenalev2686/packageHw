package ru.netology.packagehw.services;

public class VacationService {
    public int calculate( int income, int expense, int count, int threshold) {

        count = 0;
        int month = 0;
        int amount = 0;

        for (month = 0; month < 12; month++) {
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

