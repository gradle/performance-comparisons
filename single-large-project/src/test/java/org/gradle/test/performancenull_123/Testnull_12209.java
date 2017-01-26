package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12209 {
    private final Productionnull_12209 production = new Productionnull_12209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}