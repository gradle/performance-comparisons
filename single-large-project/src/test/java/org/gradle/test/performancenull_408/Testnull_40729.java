package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40729 {
    private final Productionnull_40729 production = new Productionnull_40729("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}