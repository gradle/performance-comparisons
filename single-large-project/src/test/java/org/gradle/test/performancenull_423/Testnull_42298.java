package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42298 {
    private final Productionnull_42298 production = new Productionnull_42298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}