package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42224 {
    private final Productionnull_42224 production = new Productionnull_42224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}