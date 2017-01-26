package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48346 {
    private final Productionnull_48346 production = new Productionnull_48346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}