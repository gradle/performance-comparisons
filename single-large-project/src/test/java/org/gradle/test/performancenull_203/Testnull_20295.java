package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20295 {
    private final Productionnull_20295 production = new Productionnull_20295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}