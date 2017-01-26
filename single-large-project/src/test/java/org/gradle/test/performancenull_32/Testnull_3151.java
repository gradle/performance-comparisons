package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3151 {
    private final Productionnull_3151 production = new Productionnull_3151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}