package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21065 {
    private final Productionnull_21065 production = new Productionnull_21065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}