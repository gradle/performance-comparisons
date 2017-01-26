package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31092 {
    private final Productionnull_31092 production = new Productionnull_31092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}