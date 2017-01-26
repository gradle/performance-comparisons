package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35950 {
    private final Productionnull_35950 production = new Productionnull_35950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}