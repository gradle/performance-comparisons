package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7169 {
    private final Productionnull_7169 production = new Productionnull_7169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}