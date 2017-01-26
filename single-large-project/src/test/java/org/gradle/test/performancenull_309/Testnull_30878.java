package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30878 {
    private final Productionnull_30878 production = new Productionnull_30878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}