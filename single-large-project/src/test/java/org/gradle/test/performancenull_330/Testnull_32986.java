package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32986 {
    private final Productionnull_32986 production = new Productionnull_32986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}