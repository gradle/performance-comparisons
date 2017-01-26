package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37074 {
    private final Productionnull_37074 production = new Productionnull_37074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}