package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23399 {
    private final Productionnull_23399 production = new Productionnull_23399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}