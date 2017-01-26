package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20034 {
    private final Productionnull_20034 production = new Productionnull_20034("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}