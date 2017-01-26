package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12217 {
    private final Productionnull_12217 production = new Productionnull_12217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}