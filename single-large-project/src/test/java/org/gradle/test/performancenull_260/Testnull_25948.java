package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25948 {
    private final Productionnull_25948 production = new Productionnull_25948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}