package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12228 {
    private final Productionnull_12228 production = new Productionnull_12228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}