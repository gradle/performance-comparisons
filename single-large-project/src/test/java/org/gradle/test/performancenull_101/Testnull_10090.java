package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10090 {
    private final Productionnull_10090 production = new Productionnull_10090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}