package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17438 {
    private final Productionnull_17438 production = new Productionnull_17438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}