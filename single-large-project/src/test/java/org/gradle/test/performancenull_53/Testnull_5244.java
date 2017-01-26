package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5244 {
    private final Productionnull_5244 production = new Productionnull_5244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}