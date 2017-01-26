package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2340 {
    private final Productionnull_2340 production = new Productionnull_2340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}