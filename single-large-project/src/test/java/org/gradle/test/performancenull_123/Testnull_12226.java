package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12226 {
    private final Productionnull_12226 production = new Productionnull_12226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}