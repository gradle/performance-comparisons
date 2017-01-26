package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23109 {
    private final Productionnull_23109 production = new Productionnull_23109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}