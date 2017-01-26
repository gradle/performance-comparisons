package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17485 {
    private final Productionnull_17485 production = new Productionnull_17485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}