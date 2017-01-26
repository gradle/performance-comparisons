package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22983 {
    private final Productionnull_22983 production = new Productionnull_22983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}