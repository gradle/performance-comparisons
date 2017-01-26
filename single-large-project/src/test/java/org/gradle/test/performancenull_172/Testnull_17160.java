package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17160 {
    private final Productionnull_17160 production = new Productionnull_17160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}