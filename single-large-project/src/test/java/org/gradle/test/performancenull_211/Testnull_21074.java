package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21074 {
    private final Productionnull_21074 production = new Productionnull_21074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}