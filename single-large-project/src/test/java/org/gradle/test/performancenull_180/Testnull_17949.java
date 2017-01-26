package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17949 {
    private final Productionnull_17949 production = new Productionnull_17949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}