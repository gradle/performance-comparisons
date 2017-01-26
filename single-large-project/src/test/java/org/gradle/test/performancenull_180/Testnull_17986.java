package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17986 {
    private final Productionnull_17986 production = new Productionnull_17986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}