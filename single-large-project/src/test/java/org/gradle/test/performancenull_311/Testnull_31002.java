package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31002 {
    private final Productionnull_31002 production = new Productionnull_31002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}