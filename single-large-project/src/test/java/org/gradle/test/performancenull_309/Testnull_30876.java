package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30876 {
    private final Productionnull_30876 production = new Productionnull_30876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}