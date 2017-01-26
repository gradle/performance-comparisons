package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22933 {
    private final Productionnull_22933 production = new Productionnull_22933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}