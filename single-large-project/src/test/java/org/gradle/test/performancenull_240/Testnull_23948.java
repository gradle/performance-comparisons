package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23948 {
    private final Productionnull_23948 production = new Productionnull_23948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}