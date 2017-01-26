package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12256 {
    private final Productionnull_12256 production = new Productionnull_12256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}