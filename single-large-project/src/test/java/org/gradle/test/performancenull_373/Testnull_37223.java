package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37223 {
    private final Productionnull_37223 production = new Productionnull_37223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}