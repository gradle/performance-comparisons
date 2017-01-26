package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_101 {
    private final Productionnull_101 production = new Productionnull_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}