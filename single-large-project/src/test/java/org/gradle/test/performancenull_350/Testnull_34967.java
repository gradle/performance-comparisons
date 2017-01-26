package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34967 {
    private final Productionnull_34967 production = new Productionnull_34967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}