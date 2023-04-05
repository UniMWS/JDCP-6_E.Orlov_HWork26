package ru.netology.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UsnTest {

    @Test
    public void testTaxIncome() {
        int income = 1250;
        int actual = Usn.taxIncome(income);
        int expected = income * 6 / 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testTaxIncomeExpense() {
        int income = 1250;
        int expense = 750;
        int actual = Usn.taxIncomeExpense(income, expense);
        int expected = 0;
        Assertions.assertNotSame(expected, actual);
    }

    @Test
    public void testCompareTax() {
        int income = 1250;
        int expense = 750;
        Assertions.assertTrue(Usn.compareTax(income, expense));
    }
}