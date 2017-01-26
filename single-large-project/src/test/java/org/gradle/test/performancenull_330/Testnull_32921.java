package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32921 {
    private final Productionnull_32921 production = new Productionnull_32921("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}