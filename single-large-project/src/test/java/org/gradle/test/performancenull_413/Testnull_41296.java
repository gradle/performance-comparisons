package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41296 {
    private final Productionnull_41296 production = new Productionnull_41296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}