package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24004 {
    private final Productionnull_24004 production = new Productionnull_24004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}