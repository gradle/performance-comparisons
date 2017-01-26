package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31402 {
    private final Productionnull_31402 production = new Productionnull_31402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}