package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4421 {
    private final Productionnull_4421 production = new Productionnull_4421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}