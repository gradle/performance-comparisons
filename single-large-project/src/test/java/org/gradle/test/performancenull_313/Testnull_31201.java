package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31201 {
    private final Productionnull_31201 production = new Productionnull_31201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}