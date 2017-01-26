package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4297 {
    private final Productionnull_4297 production = new Productionnull_4297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}