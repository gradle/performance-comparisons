package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32093 {
    private final Productionnull_32093 production = new Productionnull_32093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}