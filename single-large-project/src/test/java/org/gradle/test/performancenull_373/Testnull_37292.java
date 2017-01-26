package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37292 {
    private final Productionnull_37292 production = new Productionnull_37292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}