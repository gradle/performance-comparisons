package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21966 {
    private final Productionnull_21966 production = new Productionnull_21966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}