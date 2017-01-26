package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6352 {
    private final Productionnull_6352 production = new Productionnull_6352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}