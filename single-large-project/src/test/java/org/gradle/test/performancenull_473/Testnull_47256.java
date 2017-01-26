package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47256 {
    private final Productionnull_47256 production = new Productionnull_47256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}