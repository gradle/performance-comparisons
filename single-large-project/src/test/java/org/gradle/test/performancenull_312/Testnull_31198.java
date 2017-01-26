package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31198 {
    private final Productionnull_31198 production = new Productionnull_31198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}