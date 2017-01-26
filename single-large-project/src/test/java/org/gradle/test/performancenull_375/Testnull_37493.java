package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37493 {
    private final Productionnull_37493 production = new Productionnull_37493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}