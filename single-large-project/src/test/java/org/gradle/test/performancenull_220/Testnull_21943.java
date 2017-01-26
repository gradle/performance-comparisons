package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21943 {
    private final Productionnull_21943 production = new Productionnull_21943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}