package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21347 {
    private final Productionnull_21347 production = new Productionnull_21347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}