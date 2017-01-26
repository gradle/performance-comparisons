package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10343 {
    private final Productionnull_10343 production = new Productionnull_10343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}