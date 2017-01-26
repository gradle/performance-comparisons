package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12426 {
    private final Productionnull_12426 production = new Productionnull_12426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}