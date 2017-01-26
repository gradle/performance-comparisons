package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31927 {
    private final Productionnull_31927 production = new Productionnull_31927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}