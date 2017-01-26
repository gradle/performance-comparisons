package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23478 {
    private final Productionnull_23478 production = new Productionnull_23478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}