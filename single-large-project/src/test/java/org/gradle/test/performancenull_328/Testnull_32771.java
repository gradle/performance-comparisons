package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32771 {
    private final Productionnull_32771 production = new Productionnull_32771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}