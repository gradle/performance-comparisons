package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23004 {
    private final Productionnull_23004 production = new Productionnull_23004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}