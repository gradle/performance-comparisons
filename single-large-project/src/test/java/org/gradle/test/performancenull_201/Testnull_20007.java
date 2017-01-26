package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20007 {
    private final Productionnull_20007 production = new Productionnull_20007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}