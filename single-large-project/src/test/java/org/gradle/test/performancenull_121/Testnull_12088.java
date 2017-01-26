package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12088 {
    private final Productionnull_12088 production = new Productionnull_12088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}