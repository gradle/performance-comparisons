package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20048 {
    private final Productionnull_20048 production = new Productionnull_20048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}