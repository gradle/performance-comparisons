package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1454 {
    private final Productionnull_1454 production = new Productionnull_1454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}