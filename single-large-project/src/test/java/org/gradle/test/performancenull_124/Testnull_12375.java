package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12375 {
    private final Productionnull_12375 production = new Productionnull_12375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}