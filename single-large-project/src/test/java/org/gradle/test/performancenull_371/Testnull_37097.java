package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37097 {
    private final Productionnull_37097 production = new Productionnull_37097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}