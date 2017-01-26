package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31942 {
    private final Productionnull_31942 production = new Productionnull_31942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}