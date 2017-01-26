package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17091 {
    private final Productionnull_17091 production = new Productionnull_17091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}