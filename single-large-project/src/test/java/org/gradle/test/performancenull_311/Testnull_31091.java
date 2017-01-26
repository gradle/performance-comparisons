package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31091 {
    private final Productionnull_31091 production = new Productionnull_31091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}