package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41275 {
    private final Productionnull_41275 production = new Productionnull_41275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}