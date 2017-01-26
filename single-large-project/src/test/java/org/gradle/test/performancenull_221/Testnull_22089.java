package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22089 {
    private final Productionnull_22089 production = new Productionnull_22089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}