package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33095 {
    private final Productionnull_33095 production = new Productionnull_33095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}