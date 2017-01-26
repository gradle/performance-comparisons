package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33916 {
    private final Productionnull_33916 production = new Productionnull_33916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}