package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36371 {
    private final Productionnull_36371 production = new Productionnull_36371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}