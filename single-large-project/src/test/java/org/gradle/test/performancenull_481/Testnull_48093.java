package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48093 {
    private final Productionnull_48093 production = new Productionnull_48093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}