package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31928 {
    private final Productionnull_31928 production = new Productionnull_31928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}