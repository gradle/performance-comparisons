package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22954 {
    private final Productionnull_22954 production = new Productionnull_22954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}