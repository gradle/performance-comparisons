package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21355 {
    private final Productionnull_21355 production = new Productionnull_21355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}