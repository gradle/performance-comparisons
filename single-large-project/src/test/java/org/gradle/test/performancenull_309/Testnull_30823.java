package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30823 {
    private final Productionnull_30823 production = new Productionnull_30823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}