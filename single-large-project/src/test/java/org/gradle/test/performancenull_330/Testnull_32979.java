package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32979 {
    private final Productionnull_32979 production = new Productionnull_32979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}