package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {
    @Test
    public void CashBackIfLessThanBoundary(){
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void CashBackIfMoreThanBoundary(){
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(2500);
        int expected = 500;
        assertEquals(actual, expected);
    }
    @Test
    public void CashBackIfEqualsBoundary(){
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}