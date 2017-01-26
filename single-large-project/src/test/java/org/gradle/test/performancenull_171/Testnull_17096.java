package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17096 {
    private final Productionnull_17096 production = new Productionnull_17096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}