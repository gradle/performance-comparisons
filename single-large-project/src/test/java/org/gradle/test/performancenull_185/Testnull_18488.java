package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18488 {
    private final Productionnull_18488 production = new Productionnull_18488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}