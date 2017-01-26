package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3901 {
    private final Productionnull_3901 production = new Productionnull_3901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}