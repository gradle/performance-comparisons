package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17074 {
    private final Productionnull_17074 production = new Productionnull_17074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}