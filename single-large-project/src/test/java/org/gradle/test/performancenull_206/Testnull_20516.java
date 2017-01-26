package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20516 {
    private final Productionnull_20516 production = new Productionnull_20516("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}