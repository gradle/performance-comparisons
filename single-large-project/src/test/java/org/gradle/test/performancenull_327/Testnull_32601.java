package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32601 {
    private final Productionnull_32601 production = new Productionnull_32601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}