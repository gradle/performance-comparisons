package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23566 {
    private final Productionnull_23566 production = new Productionnull_23566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}