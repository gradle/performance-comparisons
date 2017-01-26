package org.gradle.test.performancenull_208;

import static org.junit.Assert.*;

public class Testnull_20781 {
    private final Productionnull_20781 production = new Productionnull_20781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}