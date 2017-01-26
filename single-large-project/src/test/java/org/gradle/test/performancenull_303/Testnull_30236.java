package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30236 {
    private final Productionnull_30236 production = new Productionnull_30236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}