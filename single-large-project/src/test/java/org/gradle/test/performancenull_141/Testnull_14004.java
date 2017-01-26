package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14004 {
    private final Productionnull_14004 production = new Productionnull_14004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}