package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18843 {
    private final Productionnull_18843 production = new Productionnull_18843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}