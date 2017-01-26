package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36341 {
    private final Productionnull_36341 production = new Productionnull_36341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}