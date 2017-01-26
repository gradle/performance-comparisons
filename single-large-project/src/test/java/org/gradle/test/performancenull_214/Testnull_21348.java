package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21348 {
    private final Productionnull_21348 production = new Productionnull_21348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}