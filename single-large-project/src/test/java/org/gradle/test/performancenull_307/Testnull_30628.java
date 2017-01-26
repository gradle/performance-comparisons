package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30628 {
    private final Productionnull_30628 production = new Productionnull_30628("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}