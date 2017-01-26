package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22950 {
    private final Productionnull_22950 production = new Productionnull_22950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}