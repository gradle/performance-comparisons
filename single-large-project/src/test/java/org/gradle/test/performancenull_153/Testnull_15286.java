package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15286 {
    private final Productionnull_15286 production = new Productionnull_15286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}