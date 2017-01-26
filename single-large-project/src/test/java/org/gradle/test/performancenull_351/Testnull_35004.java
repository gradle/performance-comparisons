package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35004 {
    private final Productionnull_35004 production = new Productionnull_35004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}