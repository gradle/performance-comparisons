package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2073 {
    private final Productionnull_2073 production = new Productionnull_2073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}