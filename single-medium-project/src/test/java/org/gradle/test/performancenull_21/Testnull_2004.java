package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2004 {
    private final Productionnull_2004 production = new Productionnull_2004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}