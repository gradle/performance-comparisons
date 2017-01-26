package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22932 {
    private final Productionnull_22932 production = new Productionnull_22932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}