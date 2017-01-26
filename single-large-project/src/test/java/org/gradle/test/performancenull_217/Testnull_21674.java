package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21674 {
    private final Productionnull_21674 production = new Productionnull_21674("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}