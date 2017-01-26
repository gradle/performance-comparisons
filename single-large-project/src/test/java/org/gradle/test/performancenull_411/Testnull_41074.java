package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41074 {
    private final Productionnull_41074 production = new Productionnull_41074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}