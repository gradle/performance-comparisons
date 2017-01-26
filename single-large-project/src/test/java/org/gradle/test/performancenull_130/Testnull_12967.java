package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12967 {
    private final Productionnull_12967 production = new Productionnull_12967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}