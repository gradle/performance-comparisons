package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6339 {
    private final Productionnull_6339 production = new Productionnull_6339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}