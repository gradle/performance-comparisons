package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17299 {
    private final Productionnull_17299 production = new Productionnull_17299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}