package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17143 {
    private final Productionnull_17143 production = new Productionnull_17143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}