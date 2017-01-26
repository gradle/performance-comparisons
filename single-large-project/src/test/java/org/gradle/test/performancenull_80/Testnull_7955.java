package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7955 {
    private final Productionnull_7955 production = new Productionnull_7955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}