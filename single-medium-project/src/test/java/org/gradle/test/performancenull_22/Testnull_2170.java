package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2170 {
    private final Productionnull_2170 production = new Productionnull_2170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}