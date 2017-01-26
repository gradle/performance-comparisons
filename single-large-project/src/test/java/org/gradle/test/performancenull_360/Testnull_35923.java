package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35923 {
    private final Productionnull_35923 production = new Productionnull_35923("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}