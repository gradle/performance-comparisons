package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32989 {
    private final Productionnull_32989 production = new Productionnull_32989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}