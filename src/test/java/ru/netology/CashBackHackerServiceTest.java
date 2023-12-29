package ru.netology;

import static org.junit.Assert.assertEquals;

public class CashBackHackerServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback2() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback3() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }
}