package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37224 {
    private final Productionnull_37224 production = new Productionnull_37224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}