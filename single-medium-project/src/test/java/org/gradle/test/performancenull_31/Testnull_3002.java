package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3002 {
    private final Productionnull_3002 production = new Productionnull_3002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}