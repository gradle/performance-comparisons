package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20069 {
    private final Productionnull_20069 production = new Productionnull_20069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}