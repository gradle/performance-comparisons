package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4173 {
    private final Productionnull_4173 production = new Productionnull_4173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}