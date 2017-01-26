package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31126 {
    private final Productionnull_31126 production = new Productionnull_31126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}