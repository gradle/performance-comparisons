package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42201 {
    private final Productionnull_42201 production = new Productionnull_42201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}