package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38398 {
    private final Productionnull_38398 production = new Productionnull_38398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}