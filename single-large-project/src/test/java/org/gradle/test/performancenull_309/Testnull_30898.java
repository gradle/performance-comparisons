package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30898 {
    private final Productionnull_30898 production = new Productionnull_30898("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}