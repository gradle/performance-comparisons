package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16942 {
    private final Productionnull_16942 production = new Productionnull_16942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}