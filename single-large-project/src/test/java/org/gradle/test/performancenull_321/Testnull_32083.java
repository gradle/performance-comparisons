package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32083 {
    private final Productionnull_32083 production = new Productionnull_32083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}