package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6386 {
    private final Productionnull_6386 production = new Productionnull_6386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}