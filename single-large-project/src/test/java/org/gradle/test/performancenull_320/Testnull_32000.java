package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_32000 {
    private final Productionnull_32000 production = new Productionnull_32000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}