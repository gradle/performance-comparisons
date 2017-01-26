package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22940 {
    private final Productionnull_22940 production = new Productionnull_22940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}