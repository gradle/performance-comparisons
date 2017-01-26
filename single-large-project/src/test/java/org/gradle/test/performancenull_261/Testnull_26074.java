package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26074 {
    private final Productionnull_26074 production = new Productionnull_26074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}