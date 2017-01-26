package org.gradle.test.performancenull_137;

import static org.junit.Assert.*;

public class Testnull_13601 {
    private final Productionnull_13601 production = new Productionnull_13601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}