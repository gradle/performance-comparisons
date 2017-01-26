package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34275 {
    private final Productionnull_34275 production = new Productionnull_34275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}