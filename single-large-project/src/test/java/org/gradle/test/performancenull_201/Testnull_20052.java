package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20052 {
    private final Productionnull_20052 production = new Productionnull_20052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}