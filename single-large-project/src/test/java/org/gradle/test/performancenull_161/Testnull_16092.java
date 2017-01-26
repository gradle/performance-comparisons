package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16092 {
    private final Productionnull_16092 production = new Productionnull_16092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}