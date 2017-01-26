package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36259 {
    private final Productionnull_36259 production = new Productionnull_36259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}