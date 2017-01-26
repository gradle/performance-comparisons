package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42287 {
    private final Productionnull_42287 production = new Productionnull_42287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}