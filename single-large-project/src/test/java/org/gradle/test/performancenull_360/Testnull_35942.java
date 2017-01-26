package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35942 {
    private final Productionnull_35942 production = new Productionnull_35942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}