package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37004 {
    private final Productionnull_37004 production = new Productionnull_37004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}