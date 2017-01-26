package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13205 {
    private final Productionnull_13205 production = new Productionnull_13205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}