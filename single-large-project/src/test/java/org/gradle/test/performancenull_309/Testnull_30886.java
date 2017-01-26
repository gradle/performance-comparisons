package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30886 {
    private final Productionnull_30886 production = new Productionnull_30886("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}