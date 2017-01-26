package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37233 {
    private final Productionnull_37233 production = new Productionnull_37233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}