package org.gradle.test.performancenull_178;

import static org.junit.Assert.*;

public class Testnull_17789 {
    private final Productionnull_17789 production = new Productionnull_17789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}