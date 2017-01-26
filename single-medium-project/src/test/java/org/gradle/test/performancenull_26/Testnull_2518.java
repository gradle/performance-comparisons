package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2518 {
    private final Productionnull_2518 production = new Productionnull_2518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}