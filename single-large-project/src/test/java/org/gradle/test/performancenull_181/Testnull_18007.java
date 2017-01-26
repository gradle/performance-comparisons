package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18007 {
    private final Productionnull_18007 production = new Productionnull_18007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}