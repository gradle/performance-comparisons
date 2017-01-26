package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18293 {
    private final Productionnull_18293 production = new Productionnull_18293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}