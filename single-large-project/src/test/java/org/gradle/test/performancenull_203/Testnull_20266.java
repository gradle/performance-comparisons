package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20266 {
    private final Productionnull_20266 production = new Productionnull_20266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}