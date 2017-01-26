package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21967 {
    private final Productionnull_21967 production = new Productionnull_21967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}