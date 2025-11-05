package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashBackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmount900() {
        // Подготовка
        CashBackHackService service = new CashBackHackService();
        int amount = 900;

        // Выполнение
        int actual = service.remain(amount);
        int expected = 100;

        // Проверка (TestNG использует actual, expected)
        Assert.assertEquals(actual, expected, "При сумме 900 должен возвращать 100");
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        // Подготовка
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;

        // Выполнение
        int actual = service.remain(amount);
        int expected = 0;

        // Проверка - ЭТОТ ТЕСТ УПАДЕТ ИЗ-ЗА БАГА!
        Assert.assertEquals(actual, expected, "При сумме 1000 должен возвращать 0");
    }

    @Test
    public void shouldReturn900WhenAmount1100() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected, "При сумме 1100 должен возвращать 900");
    }

    @Test
    public void shouldReturn0WhenAmount2000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        // ЭТОТ ТЕСТ ТОЖЕ УПАДЕТ ИЗ-ЗА БАГА!
        Assert.assertEquals(actual, expected, "При сумме 2000 должен возвращать 0");
    }

    @Test
    public void shouldReturn999WhenAmount1() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected, "При сумме 1 должен возвращать 999");
    }
}