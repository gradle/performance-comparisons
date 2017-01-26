package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49042 {
    private final Productionnull_49042 production = new Productionnull_49042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}