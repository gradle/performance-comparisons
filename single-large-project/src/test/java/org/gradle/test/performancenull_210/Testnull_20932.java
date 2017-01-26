package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20932 {
    private final Productionnull_20932 production = new Productionnull_20932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}