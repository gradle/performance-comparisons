package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6201 {
    private final Productionnull_6201 production = new Productionnull_6201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}