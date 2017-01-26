package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20462 {
    private final Productionnull_20462 production = new Productionnull_20462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}