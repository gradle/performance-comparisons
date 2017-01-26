package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20671 {
    private final Productionnull_20671 production = new Productionnull_20671("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}