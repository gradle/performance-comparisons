package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20953 {
    private final Productionnull_20953 production = new Productionnull_20953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}