package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12461 {
    private final Productionnull_12461 production = new Productionnull_12461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}