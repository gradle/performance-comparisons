package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25765 {
    private final Productionnull_25765 production = new Productionnull_25765("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}