package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20243 {
    private final Productionnull_20243 production = new Productionnull_20243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}