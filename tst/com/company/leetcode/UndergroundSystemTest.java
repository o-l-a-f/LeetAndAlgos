package com.company.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UndergroundSystemTest {
    private UndergroundSystem undergroundSystem = new UndergroundSystem();

    @Test
    public void underGroundSystem_fullSuite_exampleOne() {
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        double ans1 = undergroundSystem.getAverageTime("Paradise", "Cambridge"); // return 14.00
        double ans2 = undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 11.00
        undergroundSystem.checkIn(10, "Leyton", 24);
        double ans3 = undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 11.00
        undergroundSystem.checkOut(10, "Waterloo", 38);
        double ans4 = undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 12.00

        assertEquals(14.0, ans1);
        assertEquals(11.0, ans2);
        assertEquals(11.0, ans3);
        assertEquals(12.0, ans4);
    }

    @Test
    public void setUndergroundSystem_fullSuite_exampleTwo() {
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8);
        double ans1 = undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.00000
        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5, "Paradise", 16);
        double ans2 = undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.50000
        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30);
        double ans3 = undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 6.66667

        assertEquals(5.0, ans1);
        assertEquals(5.50, ans2);
        assertEquals(6.666666666666667, ans3);
    }

}
