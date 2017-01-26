package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20019 {
    private final Productionnull_20019 production = new Productionnull_20019("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}