package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25032 {
    private final Productionnull_25032 production = new Productionnull_25032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}