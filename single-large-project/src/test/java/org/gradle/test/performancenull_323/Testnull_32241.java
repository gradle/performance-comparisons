package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32241 {
    private final Productionnull_32241 production = new Productionnull_32241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}