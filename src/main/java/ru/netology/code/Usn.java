package ru.netology.code;

public class Usn {
    public static int taxIncome(int income) {
        return income * 6 / 100;
    }

    public static int taxIncomeExpense(int income, int expense) {
        int tax = (income - expense) * 15 / 100;
        return ((tax >= 0) ? tax : 0);
    }

    public static boolean compareTax(int income, int expense) {
        return (income * 6 / 100) == ((income - expense) * 15 / 100);
    }
}
