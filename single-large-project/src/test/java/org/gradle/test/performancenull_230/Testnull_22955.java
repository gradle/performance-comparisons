package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22955 {
    private final Productionnull_22955 production = new Productionnull_22955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}