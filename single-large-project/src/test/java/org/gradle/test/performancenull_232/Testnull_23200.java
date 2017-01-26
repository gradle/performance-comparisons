package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23200 {
    private final Productionnull_23200 production = new Productionnull_23200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}