package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31086 {
    private final Productionnull_31086 production = new Productionnull_31086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}