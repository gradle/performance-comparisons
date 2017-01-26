package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13978 {
    private final Productionnull_13978 production = new Productionnull_13978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}