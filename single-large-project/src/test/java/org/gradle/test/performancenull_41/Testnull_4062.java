package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4062 {
    private final Productionnull_4062 production = new Productionnull_4062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}