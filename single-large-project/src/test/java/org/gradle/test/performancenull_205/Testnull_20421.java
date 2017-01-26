package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20421 {
    private final Productionnull_20421 production = new Productionnull_20421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}