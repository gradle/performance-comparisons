package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18148 {
    private final Productionnull_18148 production = new Productionnull_18148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}