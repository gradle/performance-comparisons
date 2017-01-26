package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32265 {
    private final Productionnull_32265 production = new Productionnull_32265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}