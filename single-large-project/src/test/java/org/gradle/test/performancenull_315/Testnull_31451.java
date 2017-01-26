package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31451 {
    private final Productionnull_31451 production = new Productionnull_31451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}