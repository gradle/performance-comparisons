package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5946 {
    private final Productionnull_5946 production = new Productionnull_5946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}