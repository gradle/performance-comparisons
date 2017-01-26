package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20979 {
    private final Productionnull_20979 production = new Productionnull_20979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}