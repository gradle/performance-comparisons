package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35958 {
    private final Productionnull_35958 production = new Productionnull_35958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}