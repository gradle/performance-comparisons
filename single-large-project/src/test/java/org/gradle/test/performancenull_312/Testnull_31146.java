package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31146 {
    private final Productionnull_31146 production = new Productionnull_31146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}