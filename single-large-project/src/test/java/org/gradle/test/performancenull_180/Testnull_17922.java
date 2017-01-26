package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17922 {
    private final Productionnull_17922 production = new Productionnull_17922("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}