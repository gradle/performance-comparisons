package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2010 {
    private final Productionnull_2010 production = new Productionnull_2010("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}