package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25516 {
    private final Productionnull_25516 production = new Productionnull_25516("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}