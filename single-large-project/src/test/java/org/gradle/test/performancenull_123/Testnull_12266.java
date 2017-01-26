package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12266 {
    private final Productionnull_12266 production = new Productionnull_12266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}