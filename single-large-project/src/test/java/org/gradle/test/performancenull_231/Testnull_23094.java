package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23094 {
    private final Productionnull_23094 production = new Productionnull_23094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}