package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20066 {
    private final Productionnull_20066 production = new Productionnull_20066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}