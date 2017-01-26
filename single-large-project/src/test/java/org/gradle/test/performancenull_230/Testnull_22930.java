package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22930 {
    private final Productionnull_22930 production = new Productionnull_22930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}