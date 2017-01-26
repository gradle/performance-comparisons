package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33080 {
    private final Productionnull_33080 production = new Productionnull_33080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}