package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48062 {
    private final Productionnull_48062 production = new Productionnull_48062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}