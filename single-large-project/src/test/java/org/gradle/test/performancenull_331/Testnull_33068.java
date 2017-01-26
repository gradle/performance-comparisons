package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33068 {
    private final Productionnull_33068 production = new Productionnull_33068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}