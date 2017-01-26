package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23327 {
    private final Productionnull_23327 production = new Productionnull_23327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}