package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2278 {
    private final Productionnull_2278 production = new Productionnull_2278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}