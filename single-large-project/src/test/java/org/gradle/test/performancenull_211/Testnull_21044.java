package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21044 {
    private final Productionnull_21044 production = new Productionnull_21044("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}