package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10077 {
    private final Productionnull_10077 production = new Productionnull_10077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}