package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15982 {
    private final Productionnull_15982 production = new Productionnull_15982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}