package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5291 {
    private final Productionnull_5291 production = new Productionnull_5291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}