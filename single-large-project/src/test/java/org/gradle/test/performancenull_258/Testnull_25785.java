package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25785 {
    private final Productionnull_25785 production = new Productionnull_25785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}