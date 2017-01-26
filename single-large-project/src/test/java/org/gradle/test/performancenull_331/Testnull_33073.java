package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33073 {
    private final Productionnull_33073 production = new Productionnull_33073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}