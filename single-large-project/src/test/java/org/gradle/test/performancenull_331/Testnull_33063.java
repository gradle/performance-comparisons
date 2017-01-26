package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33063 {
    private final Productionnull_33063 production = new Productionnull_33063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}