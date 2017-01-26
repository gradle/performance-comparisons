package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36426 {
    private final Productionnull_36426 production = new Productionnull_36426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}