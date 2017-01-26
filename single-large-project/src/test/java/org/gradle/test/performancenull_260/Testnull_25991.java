package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25991 {
    private final Productionnull_25991 production = new Productionnull_25991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}