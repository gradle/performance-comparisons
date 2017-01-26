package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31373 {
    private final Productionnull_31373 production = new Productionnull_31373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}