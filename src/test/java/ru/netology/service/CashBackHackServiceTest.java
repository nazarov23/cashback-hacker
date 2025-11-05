package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashBackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmount900() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual); // Этот тест УПАДЕТ!
    }

    @Test
    public void shouldReturn900WhenAmount1100() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount2000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual); // Этот тест УПАДЕТ!
    }

    @Test
    public void shouldReturn999WhenAmount1() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }
}