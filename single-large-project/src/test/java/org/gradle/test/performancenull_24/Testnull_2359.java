package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2359 {
    private final Productionnull_2359 production = new Productionnull_2359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}