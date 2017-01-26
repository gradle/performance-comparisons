package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28006 {
    private final Productionnull_28006 production = new Productionnull_28006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}