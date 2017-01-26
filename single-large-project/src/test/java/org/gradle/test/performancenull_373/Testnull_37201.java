package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37201 {
    private final Productionnull_37201 production = new Productionnull_37201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}