package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31378 {
    private final Productionnull_31378 production = new Productionnull_31378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}