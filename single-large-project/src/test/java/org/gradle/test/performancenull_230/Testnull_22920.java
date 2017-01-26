package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22920 {
    private final Productionnull_22920 production = new Productionnull_22920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}