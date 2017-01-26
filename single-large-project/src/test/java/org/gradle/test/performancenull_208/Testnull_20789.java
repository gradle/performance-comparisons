package org.gradle.test.performancenull_208;

import static org.junit.Assert.*;

public class Testnull_20789 {
    private final Productionnull_20789 production = new Productionnull_20789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}