package org.example.hw5cycles.ru.netology.services;

public class HolidayService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int monthsJoy = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                //отдых
                money = money - expenses;
                money = money / 3;
                monthsJoy++;
            } else {
                //работа
                money = money + income;
                money = money - expenses;
            }

        }
        return monthsJoy;
    }
}
