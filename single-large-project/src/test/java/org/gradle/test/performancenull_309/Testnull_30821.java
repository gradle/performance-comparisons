package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30821 {
    private final Productionnull_30821 production = new Productionnull_30821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}