package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18419 {
    private final Productionnull_18419 production = new Productionnull_18419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}