package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40244 {
    private final Productionnull_40244 production = new Productionnull_40244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}