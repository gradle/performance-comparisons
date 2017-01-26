package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32702 {
    private final Productionnull_32702 production = new Productionnull_32702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}