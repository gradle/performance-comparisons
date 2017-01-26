package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46045 {
    private final Productionnull_46045 production = new Productionnull_46045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}