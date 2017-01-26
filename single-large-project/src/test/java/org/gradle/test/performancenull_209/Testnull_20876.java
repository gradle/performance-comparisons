package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20876 {
    private final Productionnull_20876 production = new Productionnull_20876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}