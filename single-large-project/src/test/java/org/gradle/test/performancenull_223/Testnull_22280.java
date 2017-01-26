package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22280 {
    private final Productionnull_22280 production = new Productionnull_22280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}