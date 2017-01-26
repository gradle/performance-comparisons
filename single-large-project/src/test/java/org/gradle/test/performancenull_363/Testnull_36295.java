package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36295 {
    private final Productionnull_36295 production = new Productionnull_36295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}