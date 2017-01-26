package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21373 {
    private final Productionnull_21373 production = new Productionnull_21373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}