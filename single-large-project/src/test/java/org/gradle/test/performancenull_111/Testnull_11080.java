package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11080 {
    private final Productionnull_11080 production = new Productionnull_11080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}