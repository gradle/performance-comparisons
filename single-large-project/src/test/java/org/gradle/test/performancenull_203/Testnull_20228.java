package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20228 {
    private final Productionnull_20228 production = new Productionnull_20228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}