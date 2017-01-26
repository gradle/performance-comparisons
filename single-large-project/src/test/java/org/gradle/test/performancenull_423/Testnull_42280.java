package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42280 {
    private final Productionnull_42280 production = new Productionnull_42280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}