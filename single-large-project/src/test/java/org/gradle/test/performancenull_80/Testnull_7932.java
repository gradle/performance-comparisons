package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7932 {
    private final Productionnull_7932 production = new Productionnull_7932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}