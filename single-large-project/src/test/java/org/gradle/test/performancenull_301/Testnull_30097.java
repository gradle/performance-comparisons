package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30097 {
    private final Productionnull_30097 production = new Productionnull_30097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}