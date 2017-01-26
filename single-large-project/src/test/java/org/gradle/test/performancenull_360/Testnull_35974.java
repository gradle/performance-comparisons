package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35974 {
    private final Productionnull_35974 production = new Productionnull_35974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}