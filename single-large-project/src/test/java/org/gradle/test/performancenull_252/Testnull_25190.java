package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25190 {
    private final Productionnull_25190 production = new Productionnull_25190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}