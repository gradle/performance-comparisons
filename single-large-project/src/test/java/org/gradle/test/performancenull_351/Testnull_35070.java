package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35070 {
    private final Productionnull_35070 production = new Productionnull_35070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}