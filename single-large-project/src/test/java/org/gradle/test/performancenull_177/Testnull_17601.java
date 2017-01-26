package org.gradle.test.performancenull_177;

import static org.junit.Assert.*;

public class Testnull_17601 {
    private final Productionnull_17601 production = new Productionnull_17601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}