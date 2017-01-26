package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18463 {
    private final Productionnull_18463 production = new Productionnull_18463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}