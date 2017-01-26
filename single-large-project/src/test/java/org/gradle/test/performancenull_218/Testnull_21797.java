package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21797 {
    private final Productionnull_21797 production = new Productionnull_21797("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}