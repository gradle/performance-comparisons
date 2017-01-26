package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30801 {
    private final Productionnull_30801 production = new Productionnull_30801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}