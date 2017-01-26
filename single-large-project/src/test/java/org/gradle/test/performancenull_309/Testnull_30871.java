package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30871 {
    private final Productionnull_30871 production = new Productionnull_30871("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}