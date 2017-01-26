package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32928 {
    private final Productionnull_32928 production = new Productionnull_32928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}