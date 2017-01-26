package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24957 {
    private final Productionnull_24957 production = new Productionnull_24957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}