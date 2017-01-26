package org.gradle.test.performancenull_174;

import static org.junit.Assert.*;

public class Testnull_17363 {
    private final Productionnull_17363 production = new Productionnull_17363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}