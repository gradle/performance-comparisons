package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36292 {
    private final Productionnull_36292 production = new Productionnull_36292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}