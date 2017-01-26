package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30841 {
    private final Productionnull_30841 production = new Productionnull_30841("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}