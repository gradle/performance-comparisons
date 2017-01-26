package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23482 {
    private final Productionnull_23482 production = new Productionnull_23482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}