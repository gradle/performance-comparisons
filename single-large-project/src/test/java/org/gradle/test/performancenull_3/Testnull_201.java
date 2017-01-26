package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_201 {
    private final Productionnull_201 production = new Productionnull_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}