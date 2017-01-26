package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25798 {
    private final Productionnull_25798 production = new Productionnull_25798("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}