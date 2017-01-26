package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1093 {
    private final Productionnull_1093 production = new Productionnull_1093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}