package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31343 {
    private final Productionnull_31343 production = new Productionnull_31343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}