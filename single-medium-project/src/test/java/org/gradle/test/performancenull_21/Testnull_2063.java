package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2063 {
    private final Productionnull_2063 production = new Productionnull_2063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}