package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12928 {
    private final Productionnull_12928 production = new Productionnull_12928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}