package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21677 {
    private final Productionnull_21677 production = new Productionnull_21677("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}