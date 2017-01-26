package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35948 {
    private final Productionnull_35948 production = new Productionnull_35948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}