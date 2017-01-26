package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20077 {
    private final Productionnull_20077 production = new Productionnull_20077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}