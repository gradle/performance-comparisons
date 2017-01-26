package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20946 {
    private final Productionnull_20946 production = new Productionnull_20946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}