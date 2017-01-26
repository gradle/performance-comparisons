package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13206 {
    private final Productionnull_13206 production = new Productionnull_13206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}