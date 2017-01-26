package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20683 {
    private final Productionnull_20683 production = new Productionnull_20683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}