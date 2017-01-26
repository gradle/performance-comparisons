package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6298 {
    private final Productionnull_6298 production = new Productionnull_6298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}