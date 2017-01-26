package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31051 {
    private final Productionnull_31051 production = new Productionnull_31051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}