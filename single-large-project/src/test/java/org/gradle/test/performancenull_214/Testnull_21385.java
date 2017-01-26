package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21385 {
    private final Productionnull_21385 production = new Productionnull_21385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}