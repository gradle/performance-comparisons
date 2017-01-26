package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37886 {
    private final Productionnull_37886 production = new Productionnull_37886("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}