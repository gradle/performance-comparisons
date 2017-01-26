package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24205 {
    private final Productionnull_24205 production = new Productionnull_24205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}