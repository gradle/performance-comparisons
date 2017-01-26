package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25162 {
    private final Productionnull_25162 production = new Productionnull_25162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}