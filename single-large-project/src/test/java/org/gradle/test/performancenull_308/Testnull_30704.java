package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30704 {
    private final Productionnull_30704 production = new Productionnull_30704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}