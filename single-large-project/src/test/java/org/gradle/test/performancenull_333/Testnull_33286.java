package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33286 {
    private final Productionnull_33286 production = new Productionnull_33286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}