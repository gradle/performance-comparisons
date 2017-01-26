package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20088 {
    private final Productionnull_20088 production = new Productionnull_20088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}