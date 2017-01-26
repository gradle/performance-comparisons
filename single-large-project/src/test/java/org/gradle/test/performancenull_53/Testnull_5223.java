package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5223 {
    private final Productionnull_5223 production = new Productionnull_5223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}