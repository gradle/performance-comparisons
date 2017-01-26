package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23485 {
    private final Productionnull_23485 production = new Productionnull_23485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}