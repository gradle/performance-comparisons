package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1908 {
    private final Productionnull_1908 production = new Productionnull_1908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}