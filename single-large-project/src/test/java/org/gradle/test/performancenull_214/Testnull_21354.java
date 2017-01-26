package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21354 {
    private final Productionnull_21354 production = new Productionnull_21354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}