package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20537 {
    private final Productionnull_20537 production = new Productionnull_20537("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}