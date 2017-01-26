package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36300 {
    private final Productionnull_36300 production = new Productionnull_36300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}