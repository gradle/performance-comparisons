package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48099 {
    private final Productionnull_48099 production = new Productionnull_48099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}