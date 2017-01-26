package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2400 {
    private final Productionnull_2400 production = new Productionnull_2400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}