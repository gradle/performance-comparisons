package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20041 {
    private final Productionnull_20041 production = new Productionnull_20041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}