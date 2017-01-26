package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22996 {
    private final Productionnull_22996 production = new Productionnull_22996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}