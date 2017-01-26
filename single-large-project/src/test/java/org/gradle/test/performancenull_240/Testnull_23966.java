package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23966 {
    private final Productionnull_23966 production = new Productionnull_23966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}