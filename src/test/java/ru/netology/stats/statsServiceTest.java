package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class statsServiceTest {

    @Test
    void shouldTotalSold() {
        statsService service = new statsService();

        int[] purchase = {100, 300, 80, 6, 20, 50, 700, 12, 58, 17, 10, 2};
        int expected = 1355;

        int actual = service.totalSold(purchase);

        assertEquals(expected, actual);

    }

    @Test
    void shouldAvgSales() {
        statsService service = new statsService();

        int[] purchase = {100, 300, 80, 6, 20, 50, 700, 12, 58, 17, 10, 2};
        int expected = 112;

        int actual = service.avgSales(purchase);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        statsService service = new statsService();

        long[] purchase = {100, 300, 80, 6, 20, 50, 700, 12, 58, 17, 10, 2};
        long expected = 7;

        int actual = service.maxSales(purchase);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMinSales() {
        statsService service = new statsService();

        long[] purchase = {100, 300, 80, 6, 20, 50, 700, 12, 58, 17, 10, 2};
        long expected = 12;

        int actual = service.minSales(purchase);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMonthsBelowAvg() {
        statsService service = new statsService();

        int[] purchase = {100, 300, 80, 6, 20, 50, 700, 12, 58, 17, 10, 2};
        int expected = 10;

        int actual = service.monthsBelowAvg(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthsAboveAvg() {
        statsService service = new statsService();

        int[] purchase = {100, 300, 80, 6, 20, 50, 700, 12, 58, 17, 10, 2};
        int expected = 2;

        int actual = service.monthsAboveAvg(purchase);
        assertEquals(expected, actual);
    }

}