package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2341 {
    private final Productionnull_2341 production = new Productionnull_2341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}