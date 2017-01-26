package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32972 {
    private final Productionnull_32972 production = new Productionnull_32972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}