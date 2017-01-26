package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30822 {
    private final Productionnull_30822 production = new Productionnull_30822("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}