package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20576 {
    private final Productionnull_20576 production = new Productionnull_20576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}