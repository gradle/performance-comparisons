package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30883 {
    private final Productionnull_30883 production = new Productionnull_30883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}