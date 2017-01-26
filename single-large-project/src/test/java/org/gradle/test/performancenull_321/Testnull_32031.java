package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32031 {
    private final Productionnull_32031 production = new Productionnull_32031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}