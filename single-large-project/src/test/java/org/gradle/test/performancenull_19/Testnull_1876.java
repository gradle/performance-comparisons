package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1876 {
    private final Productionnull_1876 production = new Productionnull_1876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}