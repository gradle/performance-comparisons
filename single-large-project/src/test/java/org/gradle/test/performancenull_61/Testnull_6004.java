package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6004 {
    private final Productionnull_6004 production = new Productionnull_6004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}