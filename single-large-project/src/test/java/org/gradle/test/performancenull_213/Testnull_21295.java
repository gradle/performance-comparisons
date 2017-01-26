package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21295 {
    private final Productionnull_21295 production = new Productionnull_21295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}