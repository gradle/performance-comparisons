package org.gradle.test.performancenull_359;

import static org.junit.Assert.*;

public class Testnull_35869 {
    private final Productionnull_35869 production = new Productionnull_35869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}