package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12283 {
    private final Productionnull_12283 production = new Productionnull_12283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}