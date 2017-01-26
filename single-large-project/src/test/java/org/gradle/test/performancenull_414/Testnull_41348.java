package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41348 {
    private final Productionnull_41348 production = new Productionnull_41348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}