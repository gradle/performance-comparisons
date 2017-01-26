package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20419 {
    private final Productionnull_20419 production = new Productionnull_20419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}