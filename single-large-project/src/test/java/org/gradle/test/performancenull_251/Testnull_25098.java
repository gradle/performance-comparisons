package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25098 {
    private final Productionnull_25098 production = new Productionnull_25098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}