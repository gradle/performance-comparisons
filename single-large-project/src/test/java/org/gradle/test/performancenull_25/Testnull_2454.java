package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2454 {
    private final Productionnull_2454 production = new Productionnull_2454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}