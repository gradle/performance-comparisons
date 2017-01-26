package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10062 {
    private final Productionnull_10062 production = new Productionnull_10062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}