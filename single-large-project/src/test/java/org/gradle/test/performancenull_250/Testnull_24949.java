package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24949 {
    private final Productionnull_24949 production = new Productionnull_24949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}