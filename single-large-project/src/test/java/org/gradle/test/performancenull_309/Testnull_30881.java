package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30881 {
    private final Productionnull_30881 production = new Productionnull_30881("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}