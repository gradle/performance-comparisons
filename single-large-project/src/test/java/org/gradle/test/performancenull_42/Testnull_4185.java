package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4185 {
    private final Productionnull_4185 production = new Productionnull_4185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}