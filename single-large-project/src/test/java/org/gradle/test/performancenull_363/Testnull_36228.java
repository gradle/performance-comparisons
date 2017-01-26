package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36228 {
    private final Productionnull_36228 production = new Productionnull_36228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}