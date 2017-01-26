package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23421 {
    private final Productionnull_23421 production = new Productionnull_23421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}