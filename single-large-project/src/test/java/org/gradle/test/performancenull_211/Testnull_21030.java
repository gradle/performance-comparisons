package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21030 {
    private final Productionnull_21030 production = new Productionnull_21030("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}