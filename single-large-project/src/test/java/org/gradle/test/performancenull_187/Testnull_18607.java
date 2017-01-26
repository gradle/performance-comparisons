package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18607 {
    private final Productionnull_18607 production = new Productionnull_18607("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}