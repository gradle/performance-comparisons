package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49045 {
    private final Productionnull_49045 production = new Productionnull_49045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}