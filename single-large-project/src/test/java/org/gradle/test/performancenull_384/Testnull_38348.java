package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38348 {
    private final Productionnull_38348 production = new Productionnull_38348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}