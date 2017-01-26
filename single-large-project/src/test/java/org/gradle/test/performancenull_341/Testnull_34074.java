package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34074 {
    private final Productionnull_34074 production = new Productionnull_34074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}