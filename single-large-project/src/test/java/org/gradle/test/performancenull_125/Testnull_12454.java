package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12454 {
    private final Productionnull_12454 production = new Productionnull_12454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}