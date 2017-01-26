package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25161 {
    private final Productionnull_25161 production = new Productionnull_25161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}