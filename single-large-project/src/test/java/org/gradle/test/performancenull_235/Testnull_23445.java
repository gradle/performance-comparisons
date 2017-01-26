package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23445 {
    private final Productionnull_23445 production = new Productionnull_23445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}