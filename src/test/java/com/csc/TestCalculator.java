package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {

    private final Calculator calculations = new Calculator();

    @Test
    public void testMaximum() {
        int[] nums = {1, 3, 7, 2, 9};
        assertEquals(9, calculations.maximumUsingForLoop(nums));
        assertEquals(9, calculations.maximumUsingStream(nums));
    }

    @Test
    public void testMinimum() {
        int[] nums = {1, 3, 7, 2, 9};
        assertEquals(1, calculations.minimumUsingForLoop(nums));
        assertEquals(1, calculations.minimumUsingStream(nums));
    }

    @Test
    public void testSum() {
        int[] nums = {1, 3, 7, 2, 9};
        assertEquals(22, calculations.sumUsingForLoop(nums));
        assertEquals(22, calculations.sumUsingStream(nums));
    }

    @Test
    public void testAverage() {
        int[] nums = {1, 3, 7, 2, 9};
        assertEquals(4.4, calculations.averageUsingForLoop(nums), 0.0001);
        assertEquals(4.4, calculations.averageUsingStream(nums), 0.0001);
    }

    @Test
    public void testSingleElementArray() {
        int[] nums = {5};
        assertEquals(5, calculations.maximumUsingForLoop(nums));
        assertEquals(5, calculations.minimumUsingForLoop(nums));
        assertEquals(5, calculations.sumUsingForLoop(nums));
        assertEquals(5.0, calculations.averageUsingForLoop(nums), 0.0001);
    }

    @Test
    public void testAllSameValues() {
        int[] nums = {3, 3, 3, 3, 3};
        assertEquals(3, calculations.maximumUsingForLoop(nums));
        assertEquals(3, calculations.minimumUsingForLoop(nums));
        assertEquals(15, calculations.sumUsingForLoop(nums));
        assertEquals(3.0, calculations.averageUsingForLoop(nums), 0.0001);
    }

    @Test
    public void testNegativeValues() {
        int[] nums = {-1, -3, -7, -2, -9};
        assertEquals(-1, calculations.maximumUsingForLoop(nums));
        assertEquals(-9, calculations.minimumUsingForLoop(nums));
        assertEquals(-22, calculations.sumUsingForLoop(nums));
        assertEquals(-4.4, calculations.averageUsingForLoop(nums), 0.0001);
    }
}
