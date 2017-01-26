package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1523 {
    private final Productionnull_1523 production = new Productionnull_1523("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}