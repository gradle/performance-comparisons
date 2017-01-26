package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5242 {
    private final Productionnull_5242 production = new Productionnull_5242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}