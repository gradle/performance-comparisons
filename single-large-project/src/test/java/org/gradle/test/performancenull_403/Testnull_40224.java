package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40224 {
    private final Productionnull_40224 production = new Productionnull_40224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}