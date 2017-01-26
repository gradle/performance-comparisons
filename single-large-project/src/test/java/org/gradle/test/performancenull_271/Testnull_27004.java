package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27004 {
    private final Productionnull_27004 production = new Productionnull_27004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}