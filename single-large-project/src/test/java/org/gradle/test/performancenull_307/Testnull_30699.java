package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30699 {
    private final Productionnull_30699 production = new Productionnull_30699("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}