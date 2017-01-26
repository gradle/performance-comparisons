package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25174 {
    private final Productionnull_25174 production = new Productionnull_25174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}