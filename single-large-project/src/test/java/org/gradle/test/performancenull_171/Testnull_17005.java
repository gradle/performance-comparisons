package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17005 {
    private final Productionnull_17005 production = new Productionnull_17005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}