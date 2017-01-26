package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20485 {
    private final Productionnull_20485 production = new Productionnull_20485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}