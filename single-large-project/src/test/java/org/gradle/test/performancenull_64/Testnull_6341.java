package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6341 {
    private final Productionnull_6341 production = new Productionnull_6341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}