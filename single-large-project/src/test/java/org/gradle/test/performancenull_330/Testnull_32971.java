package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32971 {
    private final Productionnull_32971 production = new Productionnull_32971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}