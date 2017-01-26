package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23986 {
    private final Productionnull_23986 production = new Productionnull_23986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}