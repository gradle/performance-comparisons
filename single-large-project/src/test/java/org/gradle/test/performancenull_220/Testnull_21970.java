package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21970 {
    private final Productionnull_21970 production = new Productionnull_21970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}