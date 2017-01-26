package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37521 {
    private final Productionnull_37521 production = new Productionnull_37521("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}