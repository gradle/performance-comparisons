package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25763 {
    private final Productionnull_25763 production = new Productionnull_25763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}