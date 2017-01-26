package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23599 {
    private final Productionnull_23599 production = new Productionnull_23599("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}