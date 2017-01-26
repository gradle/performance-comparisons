package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21374 {
    private final Productionnull_21374 production = new Productionnull_21374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}