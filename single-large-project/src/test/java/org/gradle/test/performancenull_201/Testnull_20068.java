package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20068 {
    private final Productionnull_20068 production = new Productionnull_20068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}