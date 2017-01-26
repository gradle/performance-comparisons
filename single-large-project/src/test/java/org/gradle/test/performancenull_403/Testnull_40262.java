package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40262 {
    private final Productionnull_40262 production = new Productionnull_40262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}