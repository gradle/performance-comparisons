package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21387 {
    private final Productionnull_21387 production = new Productionnull_21387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}