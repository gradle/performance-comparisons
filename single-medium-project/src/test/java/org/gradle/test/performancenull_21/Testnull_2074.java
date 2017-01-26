package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2074 {
    private final Productionnull_2074 production = new Productionnull_2074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}