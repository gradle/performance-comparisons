package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30874 {
    private final Productionnull_30874 production = new Productionnull_30874("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}