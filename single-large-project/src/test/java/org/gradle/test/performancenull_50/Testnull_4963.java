package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4963 {
    private final Productionnull_4963 production = new Productionnull_4963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}