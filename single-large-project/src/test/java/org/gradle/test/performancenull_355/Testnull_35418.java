package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35418 {
    private final Productionnull_35418 production = new Productionnull_35418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}