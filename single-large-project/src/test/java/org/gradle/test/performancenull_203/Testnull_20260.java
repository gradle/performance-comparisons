package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20260 {
    private final Productionnull_20260 production = new Productionnull_20260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}