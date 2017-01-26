package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23343 {
    private final Productionnull_23343 production = new Productionnull_23343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}