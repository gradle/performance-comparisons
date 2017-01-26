package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2302 {
    private final Productionnull_2302 production = new Productionnull_2302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}