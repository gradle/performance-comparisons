package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21781 {
    private final Productionnull_21781 production = new Productionnull_21781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}