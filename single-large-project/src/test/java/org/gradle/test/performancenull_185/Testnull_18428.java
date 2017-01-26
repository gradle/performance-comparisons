package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18428 {
    private final Productionnull_18428 production = new Productionnull_18428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}