package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40604 {
    private final Productionnull_40604 production = new Productionnull_40604("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}