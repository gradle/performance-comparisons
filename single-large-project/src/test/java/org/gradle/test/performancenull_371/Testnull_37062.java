package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37062 {
    private final Productionnull_37062 production = new Productionnull_37062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}