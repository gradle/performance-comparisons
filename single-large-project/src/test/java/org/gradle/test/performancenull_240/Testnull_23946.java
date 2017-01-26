package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23946 {
    private final Productionnull_23946 production = new Productionnull_23946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}