package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BonusServiceHomeTest {

    @Test
    public void testRemain() {
        BonusServiceHome bonusServiceHome = new BonusServiceHome();
        int amount = 900;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 100;

        assertEquals(actual, expected); //операция сравнения
    }

    @Test
    public void testRemain2() {
        BonusServiceHome bonusServiceHome = new BonusServiceHome();
        int amount = 10;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 990;

        assertEquals(actual, expected); //операция сравнения
    }

    @Test
    public void testRemain3() {
        BonusServiceHome bonusServiceHome = new BonusServiceHome();
        int amount = 1;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 999;

        assertEquals(actual, expected); //операция сравнения
    }

    @Test
    public void testRemain4() {
        BonusServiceHome bonusServiceHome = new BonusServiceHome();
        int amount = 1100;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 900;

        assertEquals(actual, expected); //операция сравнения
    }

    @Test
    public void testRemain5() {
        BonusServiceHome bonusServiceHome = new BonusServiceHome();
        int amount = 1000;
        int actual =  bonusServiceHome.remain(amount);
        int expected = 0;

        assertEquals(actual, expected); //операция сравнения
    }
}


