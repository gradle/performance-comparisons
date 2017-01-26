package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23490 {
    private final Productionnull_23490 production = new Productionnull_23490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}