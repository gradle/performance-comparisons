package org.gradle.test.performancenull_265;

import static org.junit.Assert.*;

public class Testnull_26500 {
    private final Productionnull_26500 production = new Productionnull_26500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}