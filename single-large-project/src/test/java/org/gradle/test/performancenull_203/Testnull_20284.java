package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20284 {
    private final Productionnull_20284 production = new Productionnull_20284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}