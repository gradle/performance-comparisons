package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23950 {
    private final Productionnull_23950 production = new Productionnull_23950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}