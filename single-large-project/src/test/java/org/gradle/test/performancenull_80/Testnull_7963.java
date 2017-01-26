package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7963 {
    private final Productionnull_7963 production = new Productionnull_7963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}