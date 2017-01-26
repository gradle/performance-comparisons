package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2352 {
    private final Productionnull_2352 production = new Productionnull_2352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}