package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20091 {
    private final Productionnull_20091 production = new Productionnull_20091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}