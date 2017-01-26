package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17148 {
    private final Productionnull_17148 production = new Productionnull_17148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}