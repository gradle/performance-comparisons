package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7431 {
    private final Productionnull_7431 production = new Productionnull_7431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}