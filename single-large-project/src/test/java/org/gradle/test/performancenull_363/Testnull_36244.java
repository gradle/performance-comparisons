package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36244 {
    private final Productionnull_36244 production = new Productionnull_36244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}