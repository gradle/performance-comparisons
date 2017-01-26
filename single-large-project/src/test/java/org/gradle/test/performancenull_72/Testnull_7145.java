package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7145 {
    private final Productionnull_7145 production = new Productionnull_7145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}