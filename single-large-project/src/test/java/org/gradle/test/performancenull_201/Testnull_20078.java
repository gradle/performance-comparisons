package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20078 {
    private final Productionnull_20078 production = new Productionnull_20078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}