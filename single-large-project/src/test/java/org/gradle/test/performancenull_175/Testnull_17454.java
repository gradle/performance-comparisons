package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17454 {
    private final Productionnull_17454 production = new Productionnull_17454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}