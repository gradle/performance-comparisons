package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7242 {
    private final Productionnull_7242 production = new Productionnull_7242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}