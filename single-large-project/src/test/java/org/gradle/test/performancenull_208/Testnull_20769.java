package org.gradle.test.performancenull_208;

import static org.junit.Assert.*;

public class Testnull_20769 {
    private final Productionnull_20769 production = new Productionnull_20769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}