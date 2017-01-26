package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12434 {
    private final Productionnull_12434 production = new Productionnull_12434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}