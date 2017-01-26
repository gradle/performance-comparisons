package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22265 {
    private final Productionnull_22265 production = new Productionnull_22265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}