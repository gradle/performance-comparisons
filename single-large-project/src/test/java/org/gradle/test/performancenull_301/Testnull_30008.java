package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30008 {
    private final Productionnull_30008 production = new Productionnull_30008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}