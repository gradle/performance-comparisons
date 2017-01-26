package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12689 {
    private final Productionnull_12689 production = new Productionnull_12689("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}