package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35989 {
    private final Productionnull_35989 production = new Productionnull_35989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}