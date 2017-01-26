package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18080 {
    private final Productionnull_18080 production = new Productionnull_18080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}