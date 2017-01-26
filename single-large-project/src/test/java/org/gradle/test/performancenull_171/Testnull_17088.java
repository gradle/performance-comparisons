package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17088 {
    private final Productionnull_17088 production = new Productionnull_17088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}