package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_443 {
    private final Productionnull_443 production = new Productionnull_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}