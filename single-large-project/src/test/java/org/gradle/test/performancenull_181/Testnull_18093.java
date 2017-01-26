package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18093 {
    private final Productionnull_18093 production = new Productionnull_18093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}