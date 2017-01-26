package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41271 {
    private final Productionnull_41271 production = new Productionnull_41271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}