package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31063 {
    private final Productionnull_31063 production = new Productionnull_31063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}