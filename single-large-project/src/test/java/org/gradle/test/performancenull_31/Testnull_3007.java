package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3007 {
    private final Productionnull_3007 production = new Productionnull_3007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}