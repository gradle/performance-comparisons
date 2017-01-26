package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13985 {
    private final Productionnull_13985 production = new Productionnull_13985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}