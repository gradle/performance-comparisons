package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37600 {
    private final Productionnull_37600 production = new Productionnull_37600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}