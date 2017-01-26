package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18295 {
    private final Productionnull_18295 production = new Productionnull_18295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}