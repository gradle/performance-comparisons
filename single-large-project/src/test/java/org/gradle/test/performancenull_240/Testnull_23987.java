package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23987 {
    private final Productionnull_23987 production = new Productionnull_23987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}