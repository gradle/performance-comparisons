package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20271 {
    private final Productionnull_20271 production = new Productionnull_20271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}