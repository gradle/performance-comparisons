package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4008 {
    private final Productionnull_4008 production = new Productionnull_4008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}