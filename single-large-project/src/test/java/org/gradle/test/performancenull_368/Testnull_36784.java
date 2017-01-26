package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36784 {
    private final Productionnull_36784 production = new Productionnull_36784("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}