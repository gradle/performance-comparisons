package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20269 {
    private final Productionnull_20269 production = new Productionnull_20269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}