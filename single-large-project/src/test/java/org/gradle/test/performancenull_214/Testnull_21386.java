package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21386 {
    private final Productionnull_21386 production = new Productionnull_21386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}