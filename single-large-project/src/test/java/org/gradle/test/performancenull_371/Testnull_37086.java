package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37086 {
    private final Productionnull_37086 production = new Productionnull_37086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}