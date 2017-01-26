package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33576 {
    private final Productionnull_33576 production = new Productionnull_33576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}