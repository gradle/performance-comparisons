package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20241 {
    private final Productionnull_20241 production = new Productionnull_20241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}