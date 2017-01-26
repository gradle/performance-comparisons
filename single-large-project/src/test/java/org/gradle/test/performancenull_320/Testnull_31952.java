package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31952 {
    private final Productionnull_31952 production = new Productionnull_31952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}