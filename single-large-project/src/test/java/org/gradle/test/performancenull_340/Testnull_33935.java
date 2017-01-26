package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33935 {
    private final Productionnull_33935 production = new Productionnull_33935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}