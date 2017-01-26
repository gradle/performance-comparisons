package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31954 {
    private final Productionnull_31954 production = new Productionnull_31954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}