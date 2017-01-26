package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40701 {
    private final Productionnull_40701 production = new Productionnull_40701("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}