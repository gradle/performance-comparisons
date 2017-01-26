package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28062 {
    private final Productionnull_28062 production = new Productionnull_28062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}