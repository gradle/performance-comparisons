package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23184 {
    private final Productionnull_23184 production = new Productionnull_23184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}