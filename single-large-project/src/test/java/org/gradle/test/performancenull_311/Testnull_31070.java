package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31070 {
    private final Productionnull_31070 production = new Productionnull_31070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}