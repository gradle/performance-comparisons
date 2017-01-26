package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38483 {
    private final Productionnull_38483 production = new Productionnull_38483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}