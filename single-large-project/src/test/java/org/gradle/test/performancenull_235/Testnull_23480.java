package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23480 {
    private final Productionnull_23480 production = new Productionnull_23480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}