package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31348 {
    private final Productionnull_31348 production = new Productionnull_31348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}