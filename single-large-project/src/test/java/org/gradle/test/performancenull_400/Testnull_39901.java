package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39901 {
    private final Productionnull_39901 production = new Productionnull_39901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}