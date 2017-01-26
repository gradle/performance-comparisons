package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31042 {
    private final Productionnull_31042 production = new Productionnull_31042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}