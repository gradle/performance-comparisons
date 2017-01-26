package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25901 {
    private final Productionnull_25901 production = new Productionnull_25901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}