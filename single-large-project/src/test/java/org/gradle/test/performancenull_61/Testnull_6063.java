package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6063 {
    private final Productionnull_6063 production = new Productionnull_6063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}