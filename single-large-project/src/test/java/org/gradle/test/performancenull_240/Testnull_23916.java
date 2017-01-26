package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23916 {
    private final Productionnull_23916 production = new Productionnull_23916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}