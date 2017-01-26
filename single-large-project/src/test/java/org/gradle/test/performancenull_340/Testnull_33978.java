package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33978 {
    private final Productionnull_33978 production = new Productionnull_33978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}