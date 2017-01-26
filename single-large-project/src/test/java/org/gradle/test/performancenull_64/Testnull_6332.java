package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6332 {
    private final Productionnull_6332 production = new Productionnull_6332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}