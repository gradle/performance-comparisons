package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20008 {
    private final Productionnull_20008 production = new Productionnull_20008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}