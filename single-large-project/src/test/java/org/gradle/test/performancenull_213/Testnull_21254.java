package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21254 {
    private final Productionnull_21254 production = new Productionnull_21254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}