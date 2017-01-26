package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28205 {
    private final Productionnull_28205 production = new Productionnull_28205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}