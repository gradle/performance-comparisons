package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17909 {
    private final Productionnull_17909 production = new Productionnull_17909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}