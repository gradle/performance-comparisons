package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31950 {
    private final Productionnull_31950 production = new Productionnull_31950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}