package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42386 {
    private final Productionnull_42386 production = new Productionnull_42386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}