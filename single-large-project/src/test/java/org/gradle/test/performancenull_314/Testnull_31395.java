package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31395 {
    private final Productionnull_31395 production = new Productionnull_31395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}