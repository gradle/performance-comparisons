package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23473 {
    private final Productionnull_23473 production = new Productionnull_23473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}