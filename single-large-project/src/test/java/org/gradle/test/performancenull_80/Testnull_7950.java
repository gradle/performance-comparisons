package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7950 {
    private final Productionnull_7950 production = new Productionnull_7950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}