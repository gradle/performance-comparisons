package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20277 {
    private final Productionnull_20277 production = new Productionnull_20277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}