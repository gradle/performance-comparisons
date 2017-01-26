package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_421 {
    private final Productionnull_421 production = new Productionnull_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}