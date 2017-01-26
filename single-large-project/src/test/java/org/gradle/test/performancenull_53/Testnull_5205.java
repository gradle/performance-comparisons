package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5205 {
    private final Productionnull_5205 production = new Productionnull_5205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}