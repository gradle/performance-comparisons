package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41298 {
    private final Productionnull_41298 production = new Productionnull_41298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}