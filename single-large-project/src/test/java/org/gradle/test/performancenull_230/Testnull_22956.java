package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22956 {
    private final Productionnull_22956 production = new Productionnull_22956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}