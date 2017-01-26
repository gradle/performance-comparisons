package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6393 {
    private final Productionnull_6393 production = new Productionnull_6393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}