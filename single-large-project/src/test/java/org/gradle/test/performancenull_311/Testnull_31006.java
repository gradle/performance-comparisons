package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31006 {
    private final Productionnull_31006 production = new Productionnull_31006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}