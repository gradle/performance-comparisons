package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20355 {
    private final Productionnull_20355 production = new Productionnull_20355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}