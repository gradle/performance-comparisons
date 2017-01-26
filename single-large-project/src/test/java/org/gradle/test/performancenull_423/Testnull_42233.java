package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42233 {
    private final Productionnull_42233 production = new Productionnull_42233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}