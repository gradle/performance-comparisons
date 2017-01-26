package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15932 {
    private final Productionnull_15932 production = new Productionnull_15932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}