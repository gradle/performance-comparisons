package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23941 {
    private final Productionnull_23941 production = new Productionnull_23941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}