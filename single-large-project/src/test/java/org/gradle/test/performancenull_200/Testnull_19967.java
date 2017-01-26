package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19967 {
    private final Productionnull_19967 production = new Productionnull_19967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}