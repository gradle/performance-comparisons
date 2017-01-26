package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21628 {
    private final Productionnull_21628 production = new Productionnull_21628("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}