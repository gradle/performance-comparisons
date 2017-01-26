package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20585 {
    private final Productionnull_20585 production = new Productionnull_20585("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}