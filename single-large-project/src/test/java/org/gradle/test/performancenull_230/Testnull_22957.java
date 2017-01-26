package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22957 {
    private final Productionnull_22957 production = new Productionnull_22957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}