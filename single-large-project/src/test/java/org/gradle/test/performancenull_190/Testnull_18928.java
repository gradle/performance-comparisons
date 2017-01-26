package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18928 {
    private final Productionnull_18928 production = new Productionnull_18928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}