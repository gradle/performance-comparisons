package org.gradle.test.performancenull_391;

import static org.junit.Assert.*;

public class Testnull_39070 {
    private final Productionnull_39070 production = new Productionnull_39070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}