package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12496 {
    private final Productionnull_12496 production = new Productionnull_12496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}