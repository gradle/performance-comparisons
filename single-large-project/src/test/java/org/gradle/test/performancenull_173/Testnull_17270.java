package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17270 {
    private final Productionnull_17270 production = new Productionnull_17270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}