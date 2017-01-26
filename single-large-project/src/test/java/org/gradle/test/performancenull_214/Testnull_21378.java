package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21378 {
    private final Productionnull_21378 production = new Productionnull_21378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}