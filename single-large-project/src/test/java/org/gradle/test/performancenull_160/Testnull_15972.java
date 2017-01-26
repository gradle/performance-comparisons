package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15972 {
    private final Productionnull_15972 production = new Productionnull_15972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}