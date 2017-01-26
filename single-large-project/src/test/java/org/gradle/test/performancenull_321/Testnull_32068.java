package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32068 {
    private final Productionnull_32068 production = new Productionnull_32068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}