package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49001 {
    private final Productionnull_49001 production = new Productionnull_49001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}