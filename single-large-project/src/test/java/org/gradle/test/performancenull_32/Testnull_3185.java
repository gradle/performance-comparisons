package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3185 {
    private final Productionnull_3185 production = new Productionnull_3185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}