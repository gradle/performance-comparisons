package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17979 {
    private final Productionnull_17979 production = new Productionnull_17979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}