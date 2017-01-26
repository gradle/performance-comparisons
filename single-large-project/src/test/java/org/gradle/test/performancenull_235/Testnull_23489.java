package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23489 {
    private final Productionnull_23489 production = new Productionnull_23489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}