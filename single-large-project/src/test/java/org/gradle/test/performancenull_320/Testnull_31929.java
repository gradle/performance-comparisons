package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31929 {
    private final Productionnull_31929 production = new Productionnull_31929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}