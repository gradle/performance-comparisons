package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31097 {
    private final Productionnull_31097 production = new Productionnull_31097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}