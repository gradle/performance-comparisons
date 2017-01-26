package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17923 {
    private final Productionnull_17923 production = new Productionnull_17923("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}