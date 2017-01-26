package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2088 {
    private final Productionnull_2088 production = new Productionnull_2088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}