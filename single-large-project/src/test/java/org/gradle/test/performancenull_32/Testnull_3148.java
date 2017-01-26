package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3148 {
    private final Productionnull_3148 production = new Productionnull_3148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}