package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25746 {
    private final Productionnull_25746 production = new Productionnull_25746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}