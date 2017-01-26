package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5215 {
    private final Productionnull_5215 production = new Productionnull_5215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}