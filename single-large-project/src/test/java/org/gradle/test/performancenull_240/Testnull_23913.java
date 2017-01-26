package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23913 {
    private final Productionnull_23913 production = new Productionnull_23913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}