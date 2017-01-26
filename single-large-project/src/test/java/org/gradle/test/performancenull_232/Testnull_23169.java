package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23169 {
    private final Productionnull_23169 production = new Productionnull_23169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}