package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23178 {
    private final Productionnull_23178 production = new Productionnull_23178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}