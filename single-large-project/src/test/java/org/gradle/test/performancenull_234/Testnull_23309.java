package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23309 {
    private final Productionnull_23309 production = new Productionnull_23309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}