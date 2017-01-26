package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24278 {
    private final Productionnull_24278 production = new Productionnull_24278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}