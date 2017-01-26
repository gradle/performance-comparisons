package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17970 {
    private final Productionnull_17970 production = new Productionnull_17970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}