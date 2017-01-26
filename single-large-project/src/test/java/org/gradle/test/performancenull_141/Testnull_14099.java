package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14099 {
    private final Productionnull_14099 production = new Productionnull_14099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}