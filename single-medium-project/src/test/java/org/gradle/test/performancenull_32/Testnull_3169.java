package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3169 {
    private final Productionnull_3169 production = new Productionnull_3169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}