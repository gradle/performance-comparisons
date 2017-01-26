package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20442 {
    private final Productionnull_20442 production = new Productionnull_20442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}