package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15398 {
    private final Productionnull_15398 production = new Productionnull_15398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}