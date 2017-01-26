package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23135 {
    private final Productionnull_23135 production = new Productionnull_23135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}