package org.gradle.test.performancenull_324;

import static org.junit.Assert.*;

public class Testnull_32398 {
    private final Productionnull_32398 production = new Productionnull_32398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}