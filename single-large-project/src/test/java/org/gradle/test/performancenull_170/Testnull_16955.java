package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16955 {
    private final Productionnull_16955 production = new Productionnull_16955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}