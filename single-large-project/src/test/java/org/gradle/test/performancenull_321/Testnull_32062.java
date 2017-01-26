package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32062 {
    private final Productionnull_32062 production = new Productionnull_32062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}