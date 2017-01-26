package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21086 {
    private final Productionnull_21086 production = new Productionnull_21086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}