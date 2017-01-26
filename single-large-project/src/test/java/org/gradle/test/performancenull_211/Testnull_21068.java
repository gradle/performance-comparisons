package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21068 {
    private final Productionnull_21068 production = new Productionnull_21068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}