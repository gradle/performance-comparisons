package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4860 {
    private final Productionnull_4860 production = new Productionnull_4860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}