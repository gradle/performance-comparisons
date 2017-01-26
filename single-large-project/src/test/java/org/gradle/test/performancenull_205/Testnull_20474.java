package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20474 {
    private final Productionnull_20474 production = new Productionnull_20474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}