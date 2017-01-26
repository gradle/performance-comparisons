package org.gradle.test.performancenull_377;

import static org.junit.Assert.*;

public class Testnull_37601 {
    private final Productionnull_37601 production = new Productionnull_37601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}