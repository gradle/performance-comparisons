package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30804 {
    private final Productionnull_30804 production = new Productionnull_30804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}