package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21185 {
    private final Productionnull_21185 production = new Productionnull_21185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}