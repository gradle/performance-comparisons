package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10989 {
    private final Productionnull_10989 production = new Productionnull_10989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}