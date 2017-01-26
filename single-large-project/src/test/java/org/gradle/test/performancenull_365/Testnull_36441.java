package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36441 {
    private final Productionnull_36441 production = new Productionnull_36441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}