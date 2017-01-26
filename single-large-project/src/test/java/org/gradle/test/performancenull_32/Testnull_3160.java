package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3160 {
    private final Productionnull_3160 production = new Productionnull_3160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}