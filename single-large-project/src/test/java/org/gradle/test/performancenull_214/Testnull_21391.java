package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21391 {
    private final Productionnull_21391 production = new Productionnull_21391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}