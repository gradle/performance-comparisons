package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17977 {
    private final Productionnull_17977 production = new Productionnull_17977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}