package org.gradle.test.performancenull_478;

import static org.junit.Assert.*;

public class Testnull_47789 {
    private final Productionnull_47789 production = new Productionnull_47789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}