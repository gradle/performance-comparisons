package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17141 {
    private final Productionnull_17141 production = new Productionnull_17141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}