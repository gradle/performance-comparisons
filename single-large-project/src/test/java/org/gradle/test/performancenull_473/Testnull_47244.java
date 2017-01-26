package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47244 {
    private final Productionnull_47244 production = new Productionnull_47244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}