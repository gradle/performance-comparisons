package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6042 {
    private final Productionnull_6042 production = new Productionnull_6042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}