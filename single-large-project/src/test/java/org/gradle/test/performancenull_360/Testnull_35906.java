package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35906 {
    private final Productionnull_35906 production = new Productionnull_35906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}