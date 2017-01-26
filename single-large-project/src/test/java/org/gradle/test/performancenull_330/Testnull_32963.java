package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32963 {
    private final Productionnull_32963 production = new Productionnull_32963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}