package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8280 {
    private final Productionnull_8280 production = new Productionnull_8280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}