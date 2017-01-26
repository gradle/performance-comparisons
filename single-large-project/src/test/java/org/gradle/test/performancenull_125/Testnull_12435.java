package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12435 {
    private final Productionnull_12435 production = new Productionnull_12435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}