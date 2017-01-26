package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8051 {
    private final Productionnull_8051 production = new Productionnull_8051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}