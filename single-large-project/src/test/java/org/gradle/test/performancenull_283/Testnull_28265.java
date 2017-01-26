package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28265 {
    private final Productionnull_28265 production = new Productionnull_28265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}