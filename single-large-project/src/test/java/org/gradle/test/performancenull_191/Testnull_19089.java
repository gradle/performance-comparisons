package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19089 {
    private final Productionnull_19089 production = new Productionnull_19089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}