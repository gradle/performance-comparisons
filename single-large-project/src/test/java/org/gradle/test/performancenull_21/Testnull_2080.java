package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2080 {
    private final Productionnull_2080 production = new Productionnull_2080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}