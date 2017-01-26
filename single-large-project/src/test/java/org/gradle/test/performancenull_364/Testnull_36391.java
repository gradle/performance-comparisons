package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36391 {
    private final Productionnull_36391 production = new Productionnull_36391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}