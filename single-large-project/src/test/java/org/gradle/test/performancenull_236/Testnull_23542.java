package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23542 {
    private final Productionnull_23542 production = new Productionnull_23542("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}