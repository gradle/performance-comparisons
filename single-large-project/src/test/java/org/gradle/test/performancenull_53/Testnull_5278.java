package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5278 {
    private final Productionnull_5278 production = new Productionnull_5278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}