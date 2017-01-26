package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23195 {
    private final Productionnull_23195 production = new Productionnull_23195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}