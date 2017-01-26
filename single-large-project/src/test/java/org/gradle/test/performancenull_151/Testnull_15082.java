package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15082 {
    private final Productionnull_15082 production = new Productionnull_15082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}