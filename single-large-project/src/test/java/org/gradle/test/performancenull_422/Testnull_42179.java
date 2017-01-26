package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42179 {
    private final Productionnull_42179 production = new Productionnull_42179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}