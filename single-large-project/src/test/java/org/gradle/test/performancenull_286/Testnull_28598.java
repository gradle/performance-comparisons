package org.gradle.test.performancenull_286;

import static org.junit.Assert.*;

public class Testnull_28598 {
    private final Productionnull_28598 production = new Productionnull_28598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}